import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dvk implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dvj> c = new Long2ObjectLinkedOpenHashMap();
   private final dvm d;
   private final Path e;
   private final boolean f;

   dvk(dvm $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dvj b(dbd $$0) throws IOException {
      long $$1 = dbd.c($$0.h(), $$0.i());
      dvj $$2 = (dvj)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dvj)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dvj $$4 = new dvj(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ur a(dbd $$0) throws IOException {
      dvj $$1 = this.b($$0);

      ur var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ve.a($$2);
      }

      return var4;
   }

   public void a(dbd $$0, vl $$1) throws IOException {
      dvj $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ve.a((DataInput)$$3, $$1, va.a());
         }
      }
   }

   protected void a(dbd $$0, @Nullable ur $$1) throws IOException {
      dvj $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ve.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      aye<IOException> $$0 = new aye<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dvj $$1 = (dvj)var2.next();

         try {
            $$1.close();
         } catch (IOException var5) {
            $$0.a(var5);
         }
      }

      $$0.a();
   }

   public void a() throws IOException {
      ObjectIterator var1 = this.c.values().iterator();

      while (var1.hasNext()) {
         dvj $$0 = (dvj)var1.next();
         $$0.b();
      }
   }
}

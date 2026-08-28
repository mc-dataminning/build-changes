import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dyf implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dye> c = new Long2ObjectLinkedOpenHashMap();
   private final dyh d;
   private final Path e;
   private final boolean f;

   dyf(dyh $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private dye b(ddp $$0) throws IOException {
      long $$1 = ddp.c($$0.h(), $$0.i());
      dye $$2 = (dye)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dye)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dye $$4 = new dye(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ug a(ddp $$0) throws IOException {
      dye $$1 = this.b($$0);

      ug var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = ut.a($$2);
      }

      return var4;
   }

   public void a(ddp $$0, va $$1) throws IOException {
      dye $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            ut.a((DataInput)$$3, $$1, up.a());
         }
      }
   }

   protected void a(ddp $$0, @Nullable ug $$1) throws IOException {
      dye $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            ut.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      ayn<IOException> $$0 = new ayn<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dye $$1 = (dye)var2.next();

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
         dye $$0 = (dye)var1.next();
         $$0.b();
      }
   }

   public dyh b() {
      return this.d;
   }
}

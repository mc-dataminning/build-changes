import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class dmd implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<dmc> c = new Long2ObjectLinkedOpenHashMap();
   private final Path d;
   private final boolean e;

   dmd(Path $$0, boolean $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private dmc b(csp $$0) throws IOException {
      long $$1 = csp.c($$0.h(), $$0.i());
      dmc $$2 = (dmc)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((dmc)this.c.removeLast()).close();
         }

         v.c(this.d);
         Path $$3 = this.d.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         dmc $$4 = new dmc($$3, this.d, this.e);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public sl a(csp $$0) throws IOException {
      dmc $$1 = this.b($$0);

      sl var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = sy.a($$2);
      }

      return var4;
   }

   public void a(csp $$0, tf $$1) throws IOException {
      dmc $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            sy.a((DataInput)$$3, $$1, su.a());
         }
      }
   }

   protected void a(csp $$0, @Nullable sl $$1) throws IOException {
      dmc $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            sy.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      atp<IOException> $$0 = new atp<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         dmc $$1 = (dmc)var2.next();

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
         dmc $$0 = (dmc)var1.next();
         $$0.a();
      }
   }
}

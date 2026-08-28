import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import javax.annotation.Nullable;

public final class ebh implements AutoCloseable {
   public static final String a = ".mca";
   private static final int b = 256;
   private final Long2ObjectLinkedOpenHashMap<ebg> c = new Long2ObjectLinkedOpenHashMap();
   private final ebj d;
   private final Path e;
   private final boolean f;

   ebh(ebj $$0, Path $$1, boolean $$2) {
      this.e = $$1;
      this.f = $$2;
      this.d = $$0;
   }

   private ebg b(dgo $$0) throws IOException {
      long $$1 = dgo.c($$0.h(), $$0.i());
      ebg $$2 = (ebg)this.c.getAndMoveToFirst($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         if (this.c.size() >= 256) {
            ((ebg)this.c.removeLast()).close();
         }

         v.c(this.e);
         Path $$3 = this.e.resolve("r." + $$0.h() + "." + $$0.i() + ".mca");
         ebg $$4 = new ebg(this.d, $$3, this.e, this.f);
         this.c.putAndMoveToFirst($$1, $$4);
         return $$4;
      }
   }

   @Nullable
   public ux a(dgo $$0) throws IOException {
      ebg $$1 = this.b($$0);

      ux var4;
      try (DataInputStream $$2 = $$1.a($$0)) {
         if ($$2 == null) {
            return null;
         }

         var4 = vk.a($$2);
      }

      return var4;
   }

   public void a(dgo $$0, vr $$1) throws IOException {
      ebg $$2 = this.b($$0);

      try (DataInputStream $$3 = $$2.a($$0)) {
         if ($$3 != null) {
            vk.a((DataInput)$$3, $$1, vg.a());
         }
      }
   }

   protected void a(dgo $$0, @Nullable ux $$1) throws IOException {
      ebg $$2 = this.b($$0);
      if ($$1 == null) {
         $$2.d($$0);
      } else {
         try (DataOutputStream $$3 = $$2.c($$0)) {
            vk.a($$1, (DataOutput)$$3);
         }
      }
   }

   @Override
   public void close() throws IOException {
      azm<IOException> $$0 = new azm<>();
      ObjectIterator var2 = this.c.values().iterator();

      while (var2.hasNext()) {
         ebg $$1 = (ebg)var2.next();

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
         ebg $$0 = (ebg)var1.next();
         $$0.b();
      }
   }

   public ebj b() {
      return this.d;
   }
}

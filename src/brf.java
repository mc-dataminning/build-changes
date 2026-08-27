import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brf {
   private static final int a = aym.d(38.25F);
   private final Map<ja<btq>, brf.a> b = new Object2ObjectOpenHashMap();
   private final brg c;
   private final int d;
   private final Function<brh, kz> e;
   @Nullable
   private String f;
   private int g;

   protected brf(brg $$0, int $$1) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> {
         int $$2 = $$1x.f() ? a : 255;
         return kt.a(lb.u, axw.b.b($$2, $$1));
      };
   }

   protected brf(brg $$0, int $$1, kz $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$1x -> $$2;
   }

   public int b() {
      return this.g;
   }

   public boolean a(bso $$0, int $$1) {
      return true;
   }

   public void a(@Nullable brv $$0, @Nullable brv $$1, bso $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bso $$0, int $$1) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.f == null) {
         this.f = ad.a("effect", lh.d.b(this));
      }

      return this.f;
   }

   public String d() {
      return this.c();
   }

   public xe e() {
      return xe.c(this.d());
   }

   public brg f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public brf a(ja<btq> $$0, String $$1, double $$2, btt.a $$3) {
      this.b.put($$0, new brf.a(UUID.fromString($$1), $$2, $$3));
      return this;
   }

   public brf a(int $$0) {
      this.g = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<ja<btq>, btt> $$1) {
      this.b.forEach(($$2, $$3) -> $$1.accept((ja<btq>)$$2, $$3.a(this.d(), $$0)));
   }

   public void a(bts $$0) {
      for (Entry<ja<btq>, brf.a> $$1 : this.b.entrySet()) {
         btr $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.b($$1.getValue().a());
         }
      }
   }

   public void a(bts $$0, int $$1) {
      for (Entry<ja<btq>, brf.a> $$2 : this.b.entrySet()) {
         btr $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.b($$2.getValue().a());
            $$3.d($$2.getValue().a(this.d(), $$1));
         }
      }
   }

   public boolean h() {
      return this.c == brg.a;
   }

   public kz a(brh $$0) {
      return this.e.apply($$0);
   }

   static record a(UUID a, double b, btt.a c) {
      public btt a(String $$0, int $$1) {
         return new btt(this.a, $$0 + " " + $$1, this.b * (double)($$1 + 1), this.c);
      }
   }
}

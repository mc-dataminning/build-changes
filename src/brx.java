import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brx implements cpi {
   public static final Codec<jm<brx>> a = lt.d.s();
   public static final yx<wk, jm<brx>> b = yv.b(lu.W);
   private static final int c = ayo.d(38.25F);
   private final Map<jm<bur>, brx.a> d = new Object2ObjectOpenHashMap();
   private final bry e;
   private final int f;
   private final Function<brz, lk> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avo> j = Optional.empty();
   private cpl k = cpn.f;

   protected brx(bry $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lf.a(lm.u, axy.b.b($$2, $$1));
      };
   }

   protected brx(bry $$0, int $$1, lk $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(btn $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsr $$0, @Nullable bsr $$1, btn $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btn $$0, int $$1) {
   }

   public void c(btn $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dO().a(null, $$0.dt(), $$0.dv(), $$0.dz(), $$1x, $$0.de(), 1.0F, 1.0F));
   }

   public void a(btn $$0, int $$1, bsr.c $$2) {
   }

   public void a(btn $$0, int $$1, brk $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ad.a("effect", lt.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public wz e() {
      return wz.c(this.d());
   }

   public bry f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public brx a(jm<bur> $$0, akr $$1, double $$2, buu.a $$3) {
      this.d.put($$0, new brx.a($$1, $$2, $$3));
      return this;
   }

   public brx a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jm<bur>, buu> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jm<bur>)$$2, $$3.a($$0)));
   }

   public void a(but $$0) {
      for (Entry<jm<bur>, brx.a> $$1 : this.d.entrySet()) {
         bus $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(but $$0, int $$1) {
      for (Entry<jm<bur>, brx.a> $$2 : this.d.entrySet()) {
         bus $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bry.a;
   }

   public lk a(brz $$0) {
      return this.g.apply($$0);
   }

   public brx a(avo $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public brx a(cpj... $$0) {
      this.k = cpn.d.a($$0);
      return this;
   }

   @Override
   public cpl i() {
      return this.k;
   }

   static record a(akr a, double b, buu.a c) {
      public buu a(int $$0) {
         return new buu(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

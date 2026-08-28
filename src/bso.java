import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bso implements cqe {
   public static final Codec<jn<bso>> a = lu.d.r();
   public static final zb<wo, jn<bso>> b = yz.b(lv.W);
   private static final int c = azc.d(38.25F);
   private final Map<jn<bvh>, bso.a> d = new Object2ObjectOpenHashMap();
   private final bsp e;
   private final int f;
   private final Function<bsq, ll> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awc> j = Optional.empty();
   private cqh k = cqj.h;

   protected bso(bsp $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lg.a(ln.u, axn.c($$2, $$1));
      };
   }

   protected bso(bsp $$0, int $$1, ll $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(buf $$0, int $$1) {
      return true;
   }

   public void a(@Nullable btj $$0, @Nullable btj $$1, buf $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(buf $$0, int $$1) {
   }

   public void c(buf $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), $$1x, $$0.di(), 1.0F, 1.0F));
   }

   public void a(buf $$0, int $$1, btj.c $$2) {
   }

   public void a(buf $$0, int $$1, bsb $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ad.a("effect", lu.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xd e() {
      return xd.c(this.d());
   }

   public bsp f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bso a(jn<bvh> $$0, alb $$1, double $$2, bvk.a $$3) {
      this.d.put($$0, new bso.a($$1, $$2, $$3));
      return this;
   }

   public bso a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jn<bvh>, bvk> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jn<bvh>)$$2, $$3.a($$0)));
   }

   public void a(bvj $$0) {
      for (Entry<jn<bvh>, bso.a> $$1 : this.d.entrySet()) {
         bvi $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bvj $$0, int $$1) {
      for (Entry<jn<bvh>, bso.a> $$2 : this.d.entrySet()) {
         bvi $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bsp.a;
   }

   public ll a(bsq $$0) {
      return this.g.apply($$0);
   }

   public bso a(awc $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bso a(cqf... $$0) {
      this.k = cqj.f.a($$0);
      return this;
   }

   @Override
   public cqh i() {
      return this.k;
   }

   static record a(alb a, double b, bvk.a c) {
      public bvk a(int $$0) {
         return new bvk(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bsw implements cqn {
   public static final Codec<jo<bsw>> a = lv.d.r();
   public static final zc<wp, jo<bsw>> b = za.b(lw.W);
   private static final int c = azf.d(38.25F);
   private final Map<jo<bvp>, bsw.a> d = new Object2ObjectOpenHashMap();
   private final bsx e;
   private final int f;
   private final Function<bsy, lm> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awf> j = Optional.empty();
   private cqq k = cqs.h;

   protected bsw(bsx $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lh.a(lo.u, axq.c($$2, $$1));
      };
   }

   protected bsw(bsx $$0, int $$1, lm $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(bun $$0, int $$1) {
      return true;
   }

   public void a(@Nullable btr $$0, @Nullable btr $$1, bun $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bun $$0, int $$1) {
   }

   public void c(bun $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dS().a(null, $$0.dx(), $$0.dz(), $$0.dD(), $$1x, $$0.di(), 1.0F, 1.0F));
   }

   public void a(bun $$0, int $$1, btr.c $$2) {
   }

   public void a(bun $$0, int $$1, bsj $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ad.a("effect", lv.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xe e() {
      return xe.c(this.d());
   }

   public bsx f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bsw a(jo<bvp> $$0, ale $$1, double $$2, bvs.a $$3) {
      this.d.put($$0, new bsw.a($$1, $$2, $$3));
      return this;
   }

   public bsw a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jo<bvp>, bvs> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jo<bvp>)$$2, $$3.a($$0)));
   }

   public void a(bvr $$0) {
      for (Entry<jo<bvp>, bsw.a> $$1 : this.d.entrySet()) {
         bvq $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bvr $$0, int $$1) {
      for (Entry<jo<bvp>, bsw.a> $$2 : this.d.entrySet()) {
         bvq $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bsx.a;
   }

   public lm a(bsy $$0) {
      return this.g.apply($$0);
   }

   public bsw a(awf $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bsw a(cqo... $$0) {
      this.k = cqs.f.a($$0);
      return this;
   }

   @Override
   public cqq i() {
      return this.k;
   }

   static record a(ale a, double b, bvs.a c) {
      public bvs a(int $$0) {
         return new bvs(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

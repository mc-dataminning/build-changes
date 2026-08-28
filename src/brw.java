import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class brw implements cpg {
   public static final Codec<jm<brw>> a = lt.d.s();
   public static final yw<wj, jm<brw>> b = yu.b(lu.W);
   private static final int c = ayn.d(38.25F);
   private final Map<jm<bup>, brw.a> d = new Object2ObjectOpenHashMap();
   private final brx e;
   private final int f;
   private final Function<bry, lk> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avn> j = Optional.empty();
   private cpj k = cpl.f;

   protected brw(brx $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lf.a(lm.u, axx.b.b($$2, $$1));
      };
   }

   protected brw(brx $$0, int $$1, lk $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(btl $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bsq $$0, @Nullable bsq $$1, btl $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(btl $$0, int $$1) {
   }

   public void c(btl $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dQ().a(null, $$0.dv(), $$0.dx(), $$0.dB(), $$1x, $$0.df(), 1.0F, 1.0F));
   }

   public void a(btl $$0, int $$1, bsq.c $$2) {
   }

   public void a(btl $$0, int $$1, brj $$2, float $$3) {
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

   public wy e() {
      return wy.c(this.d());
   }

   public brx f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public brw a(jm<bup> $$0, akq $$1, double $$2, bus.a $$3) {
      this.d.put($$0, new brw.a($$1, $$2, $$3));
      return this;
   }

   public brw a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jm<bup>, bus> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jm<bup>)$$2, $$3.a($$0)));
   }

   public void a(bur $$0) {
      for (Entry<jm<bup>, brw.a> $$1 : this.d.entrySet()) {
         buq $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bur $$0, int $$1) {
      for (Entry<jm<bup>, brw.a> $$2 : this.d.entrySet()) {
         buq $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.c($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == brx.a;
   }

   public lk a(bry $$0) {
      return this.g.apply($$0);
   }

   public brw a(avn $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public brw a(cph... $$0) {
      this.k = cpl.d.a($$0);
      return this;
   }

   @Override
   public cpj i() {
      return this.k;
   }

   static record a(akq a, double b, bus.a c) {
      public bus a(int $$0) {
         return new bus(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

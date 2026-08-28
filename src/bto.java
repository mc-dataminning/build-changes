import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bto implements crn {
   public static final Codec<jq<bto>> a = lz.d.r();
   public static final zh<wu, jq<bto>> b = zf.b(ma.W);
   private static final int c = azm.d(38.25F);
   private final Map<jq<bwk>, bto.a> d = new Object2ObjectOpenHashMap();
   private final btp e;
   private final int f;
   private final Function<btq, lq> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awm> j = Optional.empty();
   private crq k = crs.g;

   protected bto(btp $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ll.a(ls.u, axx.c($$2, $$1));
      };
   }

   protected bto(btp $$0, int $$1, lq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(arp $$0, bvh $$1, int $$2) {
      return true;
   }

   public void a(arp $$0, @Nullable bul $$1, @Nullable bul $$2, bvh $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvh $$0, int $$1) {
   }

   public void b(bvh $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dV().a(null, $$0.dA(), $$0.dC(), $$0.dG(), $$1x, $$0.dm(), 1.0F, 1.0F));
   }

   public void a(arp $$0, bvh $$1, int $$2, bul.c $$3) {
   }

   public void a(arp $$0, bvh $$1, int $$2, btb $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ae.a("effect", lz.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xj e() {
      return xj.c(this.d());
   }

   public btp f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bto a(jq<bwk> $$0, alj $$1, double $$2, bwn.a $$3) {
      this.d.put($$0, new bto.a($$1, $$2, $$3));
      return this;
   }

   public bto a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bwk>, bwn> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bwk>)$$2, $$3.a($$0)));
   }

   public void a(bwm $$0) {
      for (Entry<jq<bwk>, bto.a> $$1 : this.d.entrySet()) {
         bwl $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwm $$0, int $$1) {
      for (Entry<jq<bwk>, bto.a> $$2 : this.d.entrySet()) {
         bwl $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == btp.a;
   }

   public lq a(btq $$0) {
      return this.g.apply($$0);
   }

   public bto a(awm $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bto a(cro... $$0) {
      this.k = crs.e.a($$0);
      return this;
   }

   @Override
   public crq i() {
      return this.k;
   }

   static record a(alj a, double b, bwn.a c) {
      public bwn a(int $$0) {
         return new bwn(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class btl implements crg {
   public static final Codec<jq<btl>> a = lz.d.r();
   public static final zj<ww, jq<btl>> b = zh.b(ma.W);
   private static final int c = azn.d(38.25F);
   private final Map<jq<bwh>, btl.a> d = new Object2ObjectOpenHashMap();
   private final btm e;
   private final int f;
   private final Function<btn, lq> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awn> j = Optional.empty();
   private crj k = crl.h;

   protected btl(btm $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return ll.a(ls.u, axy.c($$2, $$1));
      };
   }

   protected btl(btm $$0, int $$1, lq $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(bve $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bui $$0, @Nullable bui $$1, bve $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bve $$0, int $$1) {
   }

   public void c(bve $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dY().a(null, $$0.dD(), $$0.dF(), $$0.dJ(), $$1x, $$0.do(), 1.0F, 1.0F));
   }

   public void a(bve $$0, int $$1, bui.c $$2) {
   }

   public void a(bve $$0, int $$1, bsy $$2, float $$3) {
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

   public xl e() {
      return xl.c(this.d());
   }

   public btm f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public btl a(jq<bwh> $$0, all $$1, double $$2, bwk.a $$3) {
      this.d.put($$0, new btl.a($$1, $$2, $$3));
      return this;
   }

   public btl a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bwh>, bwk> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bwh>)$$2, $$3.a($$0)));
   }

   public void a(bwj $$0) {
      for (Entry<jq<bwh>, btl.a> $$1 : this.d.entrySet()) {
         bwi $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwj $$0, int $$1) {
      for (Entry<jq<bwh>, btl.a> $$2 : this.d.entrySet()) {
         bwi $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == btm.a;
   }

   public lq a(btn $$0) {
      return this.g.apply($$0);
   }

   public btl a(awn $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public btl a(crh... $$0) {
      this.k = crl.f.a($$0);
      return this;
   }

   @Override
   public crj i() {
      return this.k;
   }

   static record a(all a, double b, bwk.a c) {
      public bwk a(int $$0) {
         return new bwk(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

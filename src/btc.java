import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class btc implements cqx {
   public static final Codec<jp<btc>> a = lx.d.r();
   public static final zf<ws, jp<btc>> b = zd.b(ly.W);
   private static final int c = azj.d(38.25F);
   private final Map<jp<bvy>, btc.a> d = new Object2ObjectOpenHashMap();
   private final btd e;
   private final int f;
   private final Function<bte, lo> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awj> j = Optional.empty();
   private cra k = crc.h;

   protected btc(btd $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lj.a(lq.u, axu.c($$2, $$1));
      };
   }

   protected btc(btd $$0, int $$1, lo $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(buv $$0, int $$1) {
      return true;
   }

   public void a(@Nullable btz $$0, @Nullable btz $$1, buv $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(buv $$0, int $$1) {
   }

   public void c(buv $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(buv $$0, int $$1, btz.c $$2) {
   }

   public void a(buv $$0, int $$1, bsp $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ad.a("effect", lx.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xh e() {
      return xh.c(this.d());
   }

   public btd f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public btc a(jp<bvy> $$0, alh $$1, double $$2, bwb.a $$3) {
      this.d.put($$0, new btc.a($$1, $$2, $$3));
      return this;
   }

   public btc a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jp<bvy>, bwb> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jp<bvy>)$$2, $$3.a($$0)));
   }

   public void a(bwa $$0) {
      for (Entry<jp<bvy>, btc.a> $$1 : this.d.entrySet()) {
         bvz $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwa $$0, int $$1) {
      for (Entry<jp<bvy>, btc.a> $$2 : this.d.entrySet()) {
         bvz $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == btd.a;
   }

   public lo a(bte $$0) {
      return this.g.apply($$0);
   }

   public btc a(awj $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public btc a(cqy... $$0) {
      this.k = crc.f.a($$0);
      return this;
   }

   @Override
   public cra i() {
      return this.k;
   }

   static record a(alh a, double b, bwb.a c) {
      public bwb a(int $$0) {
         return new bwb(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

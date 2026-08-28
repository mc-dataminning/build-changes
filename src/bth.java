import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class bth implements crc {
   public static final Codec<jq<bth>> a = ly.d.r();
   public static final zg<wt, jq<bth>> b = ze.b(lz.W);
   private static final int c = azk.d(38.25F);
   private final Map<jq<bwd>, bth.a> d = new Object2ObjectOpenHashMap();
   private final bti e;
   private final int f;
   private final Function<btj, lp> g;
   @Nullable
   private String h;
   private int i;
   private Optional<awk> j = Optional.empty();
   private crf k = crh.h;

   protected bth(bti $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lk.a(lr.u, axv.c($$2, $$1));
      };
   }

   protected bth(bti $$0, int $$1, lp $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(bva $$0, int $$1) {
      return true;
   }

   public void a(@Nullable bue $$0, @Nullable bue $$1, bva $$2, int $$3, double $$4) {
      this.a($$2, $$3);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void b(bva $$0, int $$1) {
   }

   public void c(bva $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dX().a(null, $$0.dC(), $$0.dE(), $$0.dI(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(bva $$0, int $$1, bue.c $$2) {
   }

   public void a(bva $$0, int $$1, bsu $$2, float $$3) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = ae.a("effect", ly.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public xi e() {
      return xi.c(this.d());
   }

   public bti f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public bth a(jq<bwd> $$0, ali $$1, double $$2, bwg.a $$3) {
      this.d.put($$0, new bth.a($$1, $$2, $$3));
      return this;
   }

   public bth a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jq<bwd>, bwg> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jq<bwd>)$$2, $$3.a($$0)));
   }

   public void a(bwf $$0) {
      for (Entry<jq<bwd>, bth.a> $$1 : this.d.entrySet()) {
         bwe $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwf $$0, int $$1) {
      for (Entry<jq<bwd>, bth.a> $$2 : this.d.entrySet()) {
         bwe $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bti.a;
   }

   public lp a(btj $$0) {
      return this.g.apply($$0);
   }

   public bth a(awk $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public bth a(crd... $$0) {
      this.k = crh.f.a($$0);
      return this;
   }

   @Override
   public crf i() {
      return this.k;
   }

   static record a(ali a, double b, bwg.a c) {
      public bwg a(int $$0) {
         return new bwg(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

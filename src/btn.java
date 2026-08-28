import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class btn implements crq {
   public static final Codec<jr<btn>> a = mb.d.r();
   public static final ym<vz, jr<btn>> b = yk.b(mc.W);
   private static final int c = ayz.d(38.25F);
   private final Map<jr<bwj>, btn.a> d = new Object2ObjectOpenHashMap();
   private final bto e;
   private final int f;
   private final Function<btp, lr> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avz> j = Optional.empty();
   private crt k = crv.g;

   protected btn(bto $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lm.a(lt.u, axk.c($$2, $$1));
      };
   }

   protected btn(bto $$0, int $$1, lr $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(arc $$0, bvg $$1, int $$2) {
      return true;
   }

   public void a(arc $$0, @Nullable buk $$1, @Nullable buk $$2, bvg $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvg $$0, int $$1) {
   }

   public void b(bvg $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(arc $$0, bvg $$1, int $$2, buk.d $$3) {
   }

   public void a(arc $$0, bvg $$1, int $$2, bta $$3, float $$4) {
   }

   public boolean a() {
      return false;
   }

   protected String c() {
      if (this.h == null) {
         this.h = af.a("effect", mb.d.b(this));
      }

      return this.h;
   }

   public String d() {
      return this.c();
   }

   public wo e() {
      return wo.c(this.d());
   }

   public bto f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public btn a(jr<bwj> $$0, aku $$1, double $$2, bwm.a $$3) {
      this.d.put($$0, new btn.a($$1, $$2, $$3));
      return this;
   }

   public btn a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jr<bwj>, bwm> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jr<bwj>)$$2, $$3.a($$0)));
   }

   public void a(bwl $$0) {
      for (Entry<jr<bwj>, btn.a> $$1 : this.d.entrySet()) {
         bwk $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwl $$0, int $$1) {
      for (Entry<jr<bwj>, btn.a> $$2 : this.d.entrySet()) {
         bwk $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == bto.a;
   }

   public lr a(btp $$0) {
      return this.g.apply($$0);
   }

   public btn a(avz $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public btn a(crr... $$0) {
      this.k = crv.e.a($$0);
      return this;
   }

   @Override
   public crt i() {
      return this.k;
   }

   static record a(aku a, double b, bwm.a c) {
      public bwm a(int $$0) {
         return new bwm(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

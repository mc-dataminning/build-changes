import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

public class btm implements cro {
   public static final Codec<jr<btm>> a = mb.d.r();
   public static final ym<vz, jr<btm>> b = yk.b(mc.W);
   private static final int c = ayy.d(38.25F);
   private final Map<jr<bwi>, btm.a> d = new Object2ObjectOpenHashMap();
   private final btn e;
   private final int f;
   private final Function<bto, lr> g;
   @Nullable
   private String h;
   private int i;
   private Optional<avy> j = Optional.empty();
   private crr k = crt.g;

   protected btm(btn $$0, int $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> {
         int $$2 = $$1x.f() ? c : 255;
         return lm.a(lt.u, axj.c($$2, $$1));
      };
   }

   protected btm(btn $$0, int $$1, lr $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$1x -> $$2;
   }

   public int b() {
      return this.i;
   }

   public boolean a(arc $$0, bvf $$1, int $$2) {
      return true;
   }

   public void a(arc $$0, @Nullable buj $$1, @Nullable buj $$2, bvf $$3, int $$4, double $$5) {
      this.a($$0, $$3, $$4);
   }

   public boolean a(int $$0, int $$1) {
      return false;
   }

   public void a(bvf $$0, int $$1) {
   }

   public void b(bvf $$0, int $$1) {
      this.j.ifPresent($$1x -> $$0.dW().a(null, $$0.dB(), $$0.dD(), $$0.dH(), $$1x, $$0.dn(), 1.0F, 1.0F));
   }

   public void a(arc $$0, bvf $$1, int $$2, buj.d $$3) {
   }

   public void a(arc $$0, bvf $$1, int $$2, bsz $$3, float $$4) {
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

   public btn f() {
      return this.e;
   }

   public int g() {
      return this.f;
   }

   public btm a(jr<bwi> $$0, aku $$1, double $$2, bwl.a $$3) {
      this.d.put($$0, new btm.a($$1, $$2, $$3));
      return this;
   }

   public btm a(int $$0) {
      this.i = $$0;
      return this;
   }

   public void a(int $$0, BiConsumer<jr<bwi>, bwl> $$1) {
      this.d.forEach(($$2, $$3) -> $$1.accept((jr<bwi>)$$2, $$3.a($$0)));
   }

   public void a(bwk $$0) {
      for (Entry<jr<bwi>, btm.a> $$1 : this.d.entrySet()) {
         bwj $$2 = $$0.a($$1.getKey());
         if ($$2 != null) {
            $$2.c($$1.getValue().a());
         }
      }
   }

   public void a(bwk $$0, int $$1) {
      for (Entry<jr<bwi>, btm.a> $$2 : this.d.entrySet()) {
         bwj $$3 = $$0.a($$2.getKey());
         if ($$3 != null) {
            $$3.c($$2.getValue().a());
            $$3.d($$2.getValue().a($$1));
         }
      }
   }

   public boolean h() {
      return this.e == btn.a;
   }

   public lr a(bto $$0) {
      return this.g.apply($$0);
   }

   public btm a(avy $$0) {
      this.j = Optional.of($$0);
      return this;
   }

   public btm a(crp... $$0) {
      this.k = crt.e.a($$0);
      return this;
   }

   @Override
   public crr i() {
      return this.k;
   }

   static record a(aku a, double b, bwl.a c) {
      public bwl a(int $$0) {
         return new bwl(this.a, this.b * (double)($$0 + 1), this.c);
      }
   }
}

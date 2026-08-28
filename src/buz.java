import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class buz extends bui implements buc, bwc {
   private static final Logger b = LogUtils.getLogger();
   private static final ako<Float> c = aks.a(buz.class, akq.d);
   private static final ako<Float> d = aks.a(buz.class, akq.d);
   private static final ako<Boolean> e = aks.a(buz.class, akq.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private buz.a k;
   @Nullable
   private buz.a l;

   public buz(bup<?> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(un $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         buz.a.a.decode(vb.a, $$0.c("attack")).resultOrPartial(ae.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (buz.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         buz.a.a.decode(vb.a, $$0.c("interaction")).resultOrPartial(ae.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (buz.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.az());
   }

   @Override
   protected void b(un $$0) {
      $$0.a("width", this.o());
      $$0.a("height", this.q());
      if (this.k != null) {
         buz.a.a.encodeStart(vb.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         buz.a.a.encodeStart(vb.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.t());
   }

   @Override
   public void a(ako<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.j_();
      }
   }

   @Override
   public boolean bI() {
      return false;
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public ert k_() {
      return ert.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean v(bui $$0) {
      if ($$0 instanceof cor $$1) {
         this.k = new buz.a($$1.cI(), this.dY().aa());
         if ($$1 instanceof arr $$2) {
            ao.h.a($$2, this, $$1.dZ().p(), 1.0F, 1.0F, false);
         }

         return !this.t();
      } else {
         return false;
      }
   }

   @Override
   public bsh a(cor $$0, bsg $$1) {
      if (this.dY().C) {
         return this.t() ? bsh.a : bsh.c;
      } else {
         this.l = new buz.a($$0.cI(), this.dY().aa());
         return bsh.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bve Z_() {
      return this.k != null ? this.dY().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bve m() {
      return this.l != null ? this.dY().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.am.a(c, $$0);
   }

   private float o() {
      return this.am.a(c);
   }

   private void b(float $$0) {
      this.am.a(d, $$0);
   }

   private float q() {
      return this.am.a(d);
   }

   private void a(boolean $$0) {
      this.am.a(e, $$0);
   }

   private boolean t() {
      return this.am.a(e);
   }

   private bul v() {
      return bul.b(this.o(), this.q());
   }

   @Override
   public bul a(bvq $$0) {
      return this.v();
   }

   @Override
   protected ezm az() {
      return this.v().a(this.dw());
   }

   static record a(UUID b, long c) {
      public static final Codec<buz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kk.a.fieldOf("player").forGetter(buz.a::a), Codec.LONG.fieldOf("timestamp").forGetter(buz.a::b)).apply($$0, buz.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

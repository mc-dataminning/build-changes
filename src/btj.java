import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btj extends bst implements bsq, bum {
   private static final Logger b = LogUtils.getLogger();
   private static final akj<Float> c = akn.a(btj.class, akl.d);
   private static final akj<Float> d = akn.a(btj.class, akl.d);
   private static final akj<Boolean> e = akn.a(btj.class, akl.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private btj.a k;
   @Nullable
   private btj.a l;

   public btj(bsz<?> $$0, dbx $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ur $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         btj.a.a.decode(vf.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (btj.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         btj.a.a.decode(vf.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (btj.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(ur $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         btj.a.a.encodeStart(vf.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         btj.a.a.encodeStart(vf.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.as());
      }
   }

   @Override
   public boolean by() {
      return false;
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public enz k_() {
      return enz.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bst $$0) {
      if ($$0 instanceof cmw $$1) {
         this.k = new btj.a($$1.cz(), this.dP().Z());
         if ($$1 instanceof arf $$2) {
            am.h.a($$2, this, $$1.dQ().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqt a(cmw $$0, bqs $$1) {
      if (this.dP().B) {
         return this.v() ? bqt.a : bqt.c;
      } else {
         this.l = new btj.a($$0.cz(), this.dP().Z());
         return bqt.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bto T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bto p() {
      return this.l != null ? this.dP().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float s() {
      return this.ao.a(c);
   }

   private void b(float $$0) {
      this.ao.a(d, $$0);
   }

   private float u() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private bsw w() {
      return bsw.b(this.s(), this.u());
   }

   @Override
   public bsw a(bua $$0) {
      return this.w();
   }

   @Override
   protected evl as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<btj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.a.fieldOf("player").forGetter(btj.a::a), Codec.LONG.fieldOf("timestamp").forGetter(btj.a::b)).apply($$0, btj.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

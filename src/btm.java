import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class btm extends bsw implements bst, bup {
   private static final Logger b = LogUtils.getLogger();
   private static final akk<Float> c = ako.a(btm.class, akm.d);
   private static final akk<Float> d = ako.a(btm.class, akm.d);
   private static final akk<Boolean> e = ako.a(btm.class, akm.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private btm.a k;
   @Nullable
   private btm.a l;

   public btm(btc<?> $$0, dca $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(us $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         btm.a.a.decode(vg.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (btm.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         btm.a.a.decode(vg.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (btm.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(us $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         btm.a.a.encodeStart(vg.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         btm.a.a.encodeStart(vg.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(akk<?> $$0) {
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
   public eoc k_() {
      return eoc.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsw $$0) {
      if ($$0 instanceof cmz $$1) {
         this.k = new btm.a($$1.cz(), this.dP().Z());
         if ($$1 instanceof arg $$2) {
            am.h.a($$2, this, $$1.dQ().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqw a(cmz $$0, bqv $$1) {
      if (this.dP().B) {
         return this.v() ? bqw.a : bqw.c;
      } else {
         this.l = new btm.a($$0.cz(), this.dP().Z());
         return bqw.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btr T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btr p() {
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

   private bsz w() {
      return bsz.b(this.s(), this.u());
   }

   @Override
   public bsz a(bud $$0) {
      return this.w();
   }

   @Override
   protected evo as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<btm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kc.a.fieldOf("player").forGetter(btm.a::a), Codec.LONG.fieldOf("timestamp").forGetter(btm.a::b)).apply($$0, btm.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

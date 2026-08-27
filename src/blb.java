import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class blb extends bkq implements bko, bmc {
   private static final Logger b = LogUtils.getLogger();
   private static final afo<Float> c = afr.a(blb.class, afq.d);
   private static final afo<Float> d = afr.a(blb.class, afq.d);
   private static final afo<Boolean> e = afr.a(blb.class, afq.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private blb.a k;
   @Nullable
   private blb.a l;

   public blb(bku<?> $$0, csa $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void b_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         blb.a.a.decode(sn.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (blb.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         blb.a.a.decode(sn.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (blb.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(rz $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         blb.a.a.encodeStart(sn.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         blb.a.a.encodeStart(sn.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(afo<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bs() {
      return false;
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public ecx r_() {
      return ecx.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Override
   public boolean u(bkq $$0) {
      if ($$0 instanceof cdu $$1) {
         this.k = new blb.a($$1.cw(), this.dN().W());
         if ($$1 instanceof amf $$2) {
            al.g.a($$2, this, $$1.dO().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bix a(cdu $$0, biw $$1) {
      if (this.dN().B) {
         return this.w() ? bix.a : bix.b;
      } else {
         this.l = new blb.a($$0.cw(), this.dN().W());
         return bix.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public blg U_() {
      return this.k != null ? this.dN().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public blg q() {
      return this.l != null ? this.dN().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.b(c, $$0);
   }

   private float s() {
      return this.an.b(c);
   }

   private void b(float $$0) {
      this.an.b(d, $$0);
   }

   private float u() {
      return this.an.b(d);
   }

   private void a(boolean $$0) {
      this.an.b(e, $$0);
   }

   private boolean w() {
      return this.an.b(e);
   }

   private bkr x() {
      return bkr.b(this.s(), this.u());
   }

   @Override
   public bkr a(bls $$0) {
      return this.x();
   }

   @Override
   protected ejp aq() {
      return this.x().a(this.dl());
   }

   static record a(UUID b, long c) {
      public static final Codec<blb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iv.a.fieldOf("player").forGetter(blb.a::a), Codec.LONG.fieldOf("timestamp").forGetter(blb.a::b)).apply($$0, blb.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

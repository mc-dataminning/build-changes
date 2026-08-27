import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsl extends brw implements brt, bto {
   private static final Logger b = LogUtils.getLogger();
   private static final ajs<Float> c = ajw.a(bsl.class, aju.d);
   private static final ajs<Float> d = ajw.a(bsl.class, aju.d);
   private static final ajs<Boolean> e = ajw.a(bsl.class, aju.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bsl.a k;
   @Nullable
   private bsl.a l;

   public bsl(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ud $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bsl.a.a.decode(ur.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bsl.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bsl.a.a.decode(ur.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bsl.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(ud $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bsl.a.a.encodeStart(ur.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bsl.a.a.encodeStart(ur.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajs<?> $$0) {
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
   public enb k_() {
      return enb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(brw $$0) {
      if ($$0 instanceof cly $$1) {
         this.k = new bsl.a($$1.cz(), this.dP().Y());
         if ($$1 instanceof aqo $$2) {
            am.h.a($$2, this, $$1.dQ().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      if (this.dP().B) {
         return this.v() ? bpw.a : bpw.b;
      } else {
         this.l = new bsl.a($$0.cz(), this.dP().Y());
         return bpw.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bsq T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bsq p() {
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

   private brz w() {
      return brz.b(this.s(), this.u());
   }

   @Override
   public brz a(btc $$0) {
      return this.w();
   }

   @Override
   protected euh as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<bsl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jr.a.fieldOf("player").forGetter(bsl.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bsl.a::b)).apply($$0, bsl.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

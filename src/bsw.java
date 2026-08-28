import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsw extends bsg implements bsd, btz {
   private static final Logger b = LogUtils.getLogger();
   private static final ajp<Float> c = ajt.a(bsw.class, ajr.d);
   private static final ajp<Float> d = ajt.a(bsw.class, ajr.d);
   private static final ajp<Boolean> e = ajt.a(bsw.class, ajr.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bsw.a k;
   @Nullable
   private bsw.a l;

   public bsw(bsm<?> $$0, dcf $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bsw.a.a.decode(ul.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bsw.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bsw.a.a.decode(ul.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bsw.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.at());
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bsw.a.a.encodeStart(ul.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bsw.a.a.encodeStart(ul.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.at());
      }
   }

   @Override
   public boolean bz() {
      return false;
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public eom k_() {
      return eom.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsg $$0) {
      if ($$0 instanceof cmk $$1) {
         this.k = new bsw.a($$1.cA(), this.dQ().Z());
         if ($$1 instanceof aqn $$2) {
            am.h.a($$2, this, $$1.dR().o(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqg a(cmk $$0, bqf $$1) {
      if (this.dQ().B) {
         return this.v() ? bqg.a : bqg.c;
      } else {
         this.l = new bsw.a($$0.cA(), this.dQ().Z());
         return bqg.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btb T_() {
      return this.k != null ? this.dQ().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btb p() {
      return this.l != null ? this.dQ().b(this.l.a()) : null;
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

   private bsj w() {
      return bsj.b(this.s(), this.u());
   }

   @Override
   public bsj a(btn $$0) {
      return this.w();
   }

   @Override
   protected ewa at() {
      return this.w().a(this.do());
   }

   static record a(UUID b, long c) {
      public static final Codec<bsw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.a.fieldOf("player").forGetter(bsw.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bsw.a::b)).apply($$0, bsw.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

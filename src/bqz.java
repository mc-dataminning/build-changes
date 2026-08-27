import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqz extends bql implements bqi, bsb {
   private static final Logger b = LogUtils.getLogger();
   private static final ajk<Float> c = ajo.a(bqz.class, ajm.d);
   private static final ajk<Float> d = ajo.a(bqz.class, ajm.d);
   private static final ajk<Boolean> e = ajo.a(bqz.class, ajm.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bqz.a k;
   @Nullable
   private bqz.a l;

   public bqz(bqr<?> $$0, czu $$1) {
      super($$0, $$1);
      this.ag = true;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(ty $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bqz.a.a.decode(um.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bqz.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bqz.a.a.decode(um.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bqz.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(ty $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.u());
      if (this.k != null) {
         bqz.a.a.encodeStart(um.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bqz.a.a.encodeStart(um.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajk<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public elw k_() {
      return elw.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bql $$0) {
      if ($$0 instanceof ckl $$1) {
         this.k = new bqz.a($$1.cx(), this.dN().Y());
         if ($$1 instanceof aqf $$2) {
            am.h.a($$2, this, $$1.dO().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      if (this.dN().B) {
         return this.v() ? boq.a : boq.b;
      } else {
         this.l = new bqz.a($$0.cx(), this.dN().Y());
         return boq.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bre T_() {
      return this.k != null ? this.dN().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bre p() {
      return this.l != null ? this.dN().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.ao.a(c, $$0);
   }

   private float r() {
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

   private bqo w() {
      return bqo.b(this.r(), this.u());
   }

   @Override
   public bqo a(brp $$0) {
      return this.w();
   }

   @Override
   protected eta aq() {
      return this.w().a(this.dl());
   }

   static record a(UUID b, long c) {
      public static final Codec<bqz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jp.a.fieldOf("player").forGetter(bqz.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bqz.a::b)).apply($$0, bqz.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

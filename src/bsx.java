import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bsx extends bsh implements bse, bua {
   private static final Logger b = LogUtils.getLogger();
   private static final ajp<Float> c = ajt.a(bsx.class, ajr.d);
   private static final ajp<Float> d = ajt.a(bsx.class, ajr.d);
   private static final ajp<Boolean> e = ajt.a(bsx.class, ajr.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bsx.a k;
   @Nullable
   private bsx.a l;

   public bsx(bsn<?> $$0, dcg $$1) {
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
         bsx.a.a.decode(ul.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bsx.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bsx.a.a.decode(ul.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bsx.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.au());
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.t());
      if (this.k != null) {
         bsx.a.a.encodeStart(ul.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bsx.a.a.encodeStart(ul.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.au());
      }
   }

   @Override
   public boolean bA() {
      return false;
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public eoo j_() {
      return eoo.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsh $$0) {
      if ($$0 instanceof cml $$1) {
         this.k = new bsx.a($$1.cB(), this.dR().Z());
         if ($$1 instanceof aqn $$2) {
            am.h.a($$2, this, $$1.dS().o(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqh a(cml $$0, bqg $$1) {
      if (this.dR().B) {
         return this.v() ? bqh.a : bqh.c;
      } else {
         this.l = new bsx.a($$0.cB(), this.dR().Z());
         return bqh.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public btc T_() {
      return this.k != null ? this.dR().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public btc p() {
      return this.l != null ? this.dR().b(this.l.a()) : null;
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

   private float t() {
      return this.ao.a(d);
   }

   private void a(boolean $$0) {
      this.ao.a(e, $$0);
   }

   private boolean v() {
      return this.ao.a(e);
   }

   private bsk w() {
      return bsk.b(this.s(), this.t());
   }

   @Override
   public bsk a(bto $$0) {
      return this.w();
   }

   @Override
   protected ewc au() {
      return this.w().a(this.dp());
   }

   static record a(UUID b, long c) {
      public static final Codec<bsx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.a.fieldOf("player").forGetter(bsx.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bsx.a::b)).apply($$0, bsx.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

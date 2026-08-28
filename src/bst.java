import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bst extends bsd implements bsa, btw {
   private static final Logger b = LogUtils.getLogger();
   private static final ajp<Float> c = ajt.a(bst.class, ajr.d);
   private static final ajp<Float> d = ajt.a(bst.class, ajr.d);
   private static final ajp<Boolean> e = ajt.a(bst.class, ajr.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bst.a k;
   @Nullable
   private bst.a l;

   public bst(bsj<?> $$0, dcd $$1) {
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
         bst.a.a.decode(ul.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bst.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bst.a.a.decode(ul.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bst.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.as());
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bst.a.a.encodeStart(ul.a, this.k).ifSuccess($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bst.a.a.encodeStart(ul.a, this.l).ifSuccess($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(ajp<?> $$0) {
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
   public eog k_() {
      return eog.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bsd $$0) {
      if ($$0 instanceof cmh $$1) {
         this.k = new bst.a($$1.cz(), this.dP().Z());
         if ($$1 instanceof aql $$2) {
            am.h.a($$2, this, $$1.dQ().o(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public bqd a(cmh $$0, bqc $$1) {
      if (this.dP().B) {
         return this.v() ? bqd.a : bqd.c;
      } else {
         this.l = new bst.a($$0.cz(), this.dP().Z());
         return bqd.c;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bsy T_() {
      return this.k != null ? this.dP().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bsy p() {
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

   private bsg w() {
      return bsg.b(this.s(), this.u());
   }

   @Override
   public bsg a(btk $$0) {
      return this.w();
   }

   @Override
   protected evu as() {
      return this.w().a(this.dn());
   }

   static record a(UUID b, long c) {
      public static final Codec<bst.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kd.a.fieldOf("player").forGetter(bst.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bst.a::b)).apply($$0, bst.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

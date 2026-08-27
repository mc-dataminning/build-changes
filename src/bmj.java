import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmj extends blw implements blu, bnk {
   private static final Logger b = LogUtils.getLogger();
   private static final agn<Float> c = agq.a(bmj.class, agp.d);
   private static final agn<Float> d = agq.a(bmj.class, agp.d);
   private static final agn<Boolean> e = agq.a(bmj.class, agp.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bmj.a k;
   @Nullable
   private bmj.a l;

   public bmj(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void c_() {
      this.an.a(c, 1.0F);
      this.an.a(d, 1.0F);
      this.an.a(e, false);
   }

   @Override
   protected void a(so $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bmj.a.a.decode(tc.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bmj.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bmj.a.a.decode(tc.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bmj.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.b(this.aq());
   }

   @Override
   protected void b(so $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bmj.a.a.encodeStart(tc.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bmj.a.a.encodeStart(tc.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.b(this.aq());
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
   public efe s_() {
      return efe.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean t(blw $$0) {
      if ($$0 instanceof cfq $$1) {
         this.k = new bmj.a($$1.cw(), this.dL().X());
         if ($$1 instanceof anf $$2) {
            am.h.a($$2, this, $$1.dM().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bkc a(cfq $$0, bkb $$1) {
      if (this.dL().B) {
         return this.w() ? bkc.a : bkc.b;
      } else {
         this.l = new bmj.a($$0.cw(), this.dL().X());
         return bkc.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bmo V_() {
      return this.k != null ? this.dL().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bmo q() {
      return this.l != null ? this.dL().b(this.l.a()) : null;
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

   private blz x() {
      return blz.b(this.s(), this.u());
   }

   @Override
   public blz a(bna $$0) {
      return this.x();
   }

   @Override
   protected elx aq() {
      return this.x().a(this.dj());
   }

   static record a(UUID b, long c) {
      public static final Codec<bmj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ja.a.fieldOf("player").forGetter(bmj.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bmj.a::b)).apply($$0, bmj.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmg extends blv implements blt, bnh {
   private static final Logger b = LogUtils.getLogger();
   private static final agm<Float> c = agp.a(bmg.class, ago.d);
   private static final agm<Float> d = agp.a(bmg.class, ago.d);
   private static final agm<Boolean> e = agp.a(bmg.class, ago.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bmg.a k;
   @Nullable
   private bmg.a l;

   public bmg(blz<?> $$0, ctp $$1) {
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
   protected void a(sn $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bmg.a.a.decode(tb.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bmg.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bmg.a.a.decode(tb.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bmg.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sn $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bmg.a.a.encodeStart(tb.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bmg.a.a.encodeStart(tb.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(agm<?> $$0) {
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
   public eew s_() {
      return eew.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(blv $$0) {
      if ($$0 instanceof cfi $$1) {
         this.k = new bmg.a($$1.cw(), this.dM().X());
         if ($$1 instanceof ane $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bkb a(cfi $$0, bka $$1) {
      if (this.dM().B) {
         return this.w() ? bkb.a : bkb.b;
      } else {
         this.l = new bmg.a($$0.cw(), this.dM().X());
         return bkb.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bml V_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bml q() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
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

   private blw x() {
      return blw.b(this.s(), this.u());
   }

   @Override
   public blw a(bmx $$0) {
      return this.x();
   }

   @Override
   protected elo aq() {
      return this.x().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bmg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ja.a.fieldOf("player").forGetter(bmg.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bmg.a::b)).apply($$0, bmg.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

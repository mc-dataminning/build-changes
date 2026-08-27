import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class blg extends bkv implements bkt, bmh {
   private static final Logger b = LogUtils.getLogger();
   private static final afs<Float> c = afv.a(blg.class, afu.d);
   private static final afs<Float> d = afv.a(blg.class, afu.d);
   private static final afs<Boolean> e = afv.a(blg.class, afu.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private blg.a k;
   @Nullable
   private blg.a l;

   public blg(bkz<?> $$0, csf $$1) {
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
   protected void a(sd $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         blg.a.a.decode(sr.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (blg.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         blg.a.a.decode(sr.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (blg.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sd $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         blg.a.a.encodeStart(sr.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         blg.a.a.encodeStart(sr.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(afs<?> $$0) {
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
   public edc s_() {
      return edc.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bkv $$0) {
      if ($$0 instanceof cdz $$1) {
         this.k = new blg.a($$1.cw(), this.dN().W());
         if ($$1 instanceof amj $$2) {
            al.g.a($$2, this, $$1.dO().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bjb a(cdz $$0, bja $$1) {
      if (this.dN().B) {
         return this.w() ? bjb.a : bjb.b;
      } else {
         this.l = new blg.a($$0.cw(), this.dN().W());
         return bjb.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bll V_() {
      return this.k != null ? this.dN().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bll q() {
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

   private bkw x() {
      return bkw.b(this.s(), this.u());
   }

   @Override
   public bkw a(blx $$0) {
      return this.x();
   }

   @Override
   protected eju aq() {
      return this.x().a(this.dl());
   }

   static record a(UUID b, long c) {
      public static final Codec<blg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(iz.a.fieldOf("player").forGetter(blg.a::a), Codec.LONG.fieldOf("timestamp").forGetter(blg.a::b)).apply($$0, blg.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

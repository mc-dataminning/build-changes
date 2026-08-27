import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqj extends bpv implements bps, brl {
   private static final Logger b = LogUtils.getLogger();
   private static final aiy<Float> c = ajc.a(bqj.class, aja.d);
   private static final aiy<Float> d = ajc.a(bqj.class, aja.d);
   private static final aiy<Boolean> e = ajc.a(bqj.class, aja.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bqj.a k;
   @Nullable
   private bqj.a l;

   public bqj(bqb<?> $$0, cyx $$1) {
      super($$0, $$1);
      this.af = true;
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(c, 1.0F);
      $$0.a(d, 1.0F);
      $$0.a(e, false);
   }

   @Override
   protected void a(tm $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bqj.a.a.decode(ua.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bqj.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bqj.a.a.decode(ua.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bqj.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(tm $$0) {
      $$0.a("width", this.r());
      $$0.a("height", this.u());
      if (this.k != null) {
         bqj.a.a.encodeStart(ua.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bqj.a.a.encodeStart(ua.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.v());
   }

   @Override
   public void a(aiy<?> $$0) {
      super.a($$0);
      if (d.equals($$0) || c.equals($$0)) {
         this.a(this.aq());
      }
   }

   @Override
   public boolean bv() {
      return false;
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public ekx k_() {
      return ekx.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(bpv $$0) {
      if ($$0 instanceof cjt $$1) {
         this.k = new bqj.a($$1.cw(), this.dM().Y());
         if ($$1 instanceof apt $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.v();
      } else {
         return false;
      }
   }

   @Override
   public boa a(cjt $$0, bnz $$1) {
      if (this.dM().B) {
         return this.v() ? boa.a : boa.b;
      } else {
         this.l = new bqj.a($$0.cw(), this.dM().Y());
         return boa.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bqo T_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bqo p() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.an.a(c, $$0);
   }

   private float r() {
      return this.an.a(c);
   }

   private void b(float $$0) {
      this.an.a(d, $$0);
   }

   private float u() {
      return this.an.a(d);
   }

   private void a(boolean $$0) {
      this.an.a(e, $$0);
   }

   private boolean v() {
      return this.an.a(e);
   }

   private bpy w() {
      return bpy.b(this.r(), this.u());
   }

   @Override
   public bpy a(bqz $$0) {
      return this.w();
   }

   @Override
   protected erv aq() {
      return this.w().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bqj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jf.a.fieldOf("player").forGetter(bqj.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bqj.a::b)).apply($$0, bqj.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

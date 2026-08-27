import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmf extends blu implements bls, bng {
   private static final Logger b = LogUtils.getLogger();
   private static final agm<Float> c = agp.a(bmf.class, ago.d);
   private static final agm<Float> d = agp.a(bmf.class, ago.d);
   private static final agm<Boolean> e = agp.a(bmf.class, ago.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bmf.a k;
   @Nullable
   private bmf.a l;

   public bmf(bly<?> $$0, cto $$1) {
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
         bmf.a.a.decode(tb.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bmf.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bmf.a.a.decode(tb.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bmf.a)$$0x.getFirst());
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
         bmf.a.a.encodeStart(tb.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bmf.a.a.encodeStart(tb.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
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
   public eev s_() {
      return eev.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean u(blu $$0) {
      if ($$0 instanceof cfh $$1) {
         this.k = new bmf.a($$1.cw(), this.dM().X());
         if ($$1 instanceof ane $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public bka a(cfh $$0, bjz $$1) {
      if (this.dM().B) {
         return this.w() ? bka.a : bka.b;
      } else {
         this.l = new bmf.a($$0.cw(), this.dM().X());
         return bka.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public bmk V_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public bmk q() {
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

   private blv x() {
      return blv.b(this.s(), this.u());
   }

   @Override
   public blv a(bmw $$0) {
      return this.x();
   }

   @Override
   protected eln aq() {
      return this.x().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bmf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ja.a.fieldOf("player").forGetter(bmf.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bmf.a::b)).apply($$0, bmf.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

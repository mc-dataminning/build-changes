import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bod extends bnq implements bno, bpf {
   private static final Logger b = LogUtils.getLogger();
   private static final aie<Float> c = aih.a(bod.class, aig.d);
   private static final aie<Float> d = aih.a(bod.class, aig.d);
   private static final aie<Boolean> e = aih.a(bod.class, aig.k);
   private static final String f = "width";
   private static final String g = "height";
   private static final String h = "attack";
   private static final String i = "interaction";
   private static final String j = "response";
   @Nullable
   private bod.a k;
   @Nullable
   private bod.a l;

   public bod(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
      this.ae = true;
   }

   @Override
   protected void c_() {
      this.am.a(c, 1.0F);
      this.am.a(d, 1.0F);
      this.am.a(e, false);
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.b("width", 99)) {
         this.a($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.b($$0.j("height"));
      }

      if ($$0.e("attack")) {
         bod.a.a.decode(tk.a, $$0.c("attack")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.k = (bod.a)$$0x.getFirst());
      } else {
         this.k = null;
      }

      if ($$0.e("interaction")) {
         bod.a.a.decode(tk.a, $$0.c("interaction")).resultOrPartial(ac.a("Interaction entity", b::error)).ifPresent($$0x -> this.l = (bod.a)$$0x.getFirst());
      } else {
         this.l = null;
      }

      this.a($$0.q("response"));
      this.a(this.aq());
   }

   @Override
   protected void b(sw $$0) {
      $$0.a("width", this.s());
      $$0.a("height", this.u());
      if (this.k != null) {
         bod.a.a.encodeStart(tk.a, this.k).result().ifPresent($$1 -> $$0.a("attack", $$1));
      }

      if (this.l != null) {
         bod.a.a.encodeStart(tk.a, this.l).result().ifPresent($$1 -> $$0.a("interaction", $$1));
      }

      $$0.a("response", this.w());
   }

   @Override
   public void a(aie<?> $$0) {
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
   public ehb s_() {
      return ehb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Override
   public boolean t(bnq $$0) {
      if ($$0 instanceof chl $$1) {
         this.k = new bod.a($$1.cw(), this.dM().X());
         if ($$1 instanceof aox $$2) {
            am.h.a($$2, this, $$1.dN().n(), 1.0F, 1.0F, false);
         }

         return !this.w();
      } else {
         return false;
      }
   }

   @Override
   public blw a(chl $$0, blv $$1) {
      if (this.dM().B) {
         return this.w() ? blw.a : blw.b;
      } else {
         this.l = new bod.a($$0.cw(), this.dM().X());
         return blw.b;
      }
   }

   @Override
   public void l() {
   }

   @Nullable
   @Override
   public boi V_() {
      return this.k != null ? this.dM().b(this.k.a()) : null;
   }

   @Nullable
   @Override
   public boi q() {
      return this.l != null ? this.dM().b(this.l.a()) : null;
   }

   private void a(float $$0) {
      this.am.b(c, $$0);
   }

   private float s() {
      return this.am.b(c);
   }

   private void b(float $$0) {
      this.am.b(d, $$0);
   }

   private float u() {
      return this.am.b(d);
   }

   private void a(boolean $$0) {
      this.am.b(e, $$0);
   }

   private boolean w() {
      return this.am.b(e);
   }

   private bnt x() {
      return bnt.b(this.s(), this.u());
   }

   @Override
   public bnt a(bot $$0) {
      return this.x();
   }

   @Override
   protected enu aq() {
      return this.x().a(this.dk());
   }

   static record a(UUID b, long c) {
      public static final Codec<bod.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jc.a.fieldOf("player").forGetter(bod.a::a), Codec.LONG.fieldOf("timestamp").forGetter(bod.a::b)).apply($$0, bod.a::new)
      );

      public UUID a() {
         return this.b;
      }

      public long b() {
         return this.c;
      }
   }
}

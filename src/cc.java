import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cc(cs.d c, cs.d d) implements de<Integer> {
   public static final Codec<cc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(cs.d.d, "durability", cs.d.c).forGetter(cc::b), axe.a(cs.d.d, "damage", cs.d.c).forGetter(cc::c)).apply($$0, cc::new)
   );

   @Override
   public jy<Integer> a() {
      return jz.b;
   }

   public boolean a(csd $$0, Integer $$1) {
      return !this.c.d($$0.n() - $$1) ? false : this.d.d($$1);
   }

   public static cc a(cs.d $$0) {
      return new cc($$0, cs.d.c);
   }

   public cs.d b() {
      return this.c;
   }

   public cs.d c() {
      return this.d;
   }
}

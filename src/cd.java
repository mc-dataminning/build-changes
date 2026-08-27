import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cd(ct.d c, ct.d d) implements df<Integer> {
   public static final Codec<cd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axh.a(ct.d.d, "durability", ct.d.c).forGetter(cd::b), axh.a(ct.d.d, "damage", ct.d.c).forGetter(cd::c)).apply($$0, cd::new)
   );

   @Override
   public jz<Integer> a() {
      return ka.d;
   }

   public boolean a(csz $$0, Integer $$1) {
      return !this.c.d($$0.n() - $$1) ? false : this.d.d($$1);
   }

   public static cd a(ct.d $$0) {
      return new cd($$0, ct.d.c);
   }

   public ct.d b() {
      return this.c;
   }

   public ct.d c() {
      return this.d;
   }
}

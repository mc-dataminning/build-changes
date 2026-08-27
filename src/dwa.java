import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dwa extends dwn {
   public static final Codec<dwa> a = RecordCodecBuilder.create($$0 -> $$0.group(dny.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dwa::new));
   private final dny c;

   private dwa(dny $$0) {
      this.c = $$0;
   }

   public static dwa a(dny $$0) {
      return new dwa($$0);
   }

   @Override
   protected boolean a(dwm $$0, ats $$1, ht $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dwp<?> b() {
      return dwp.a;
   }
}

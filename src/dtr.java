import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtr extends due {
   public static final Codec<dtr> a = RecordCodecBuilder.create($$0 -> $$0.group(dlp.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, dtr::new));
   private final dlp c;

   private dtr(dlp $$0) {
      this.c = $$0;
   }

   public static dtr a(dlp $$0) {
      return new dtr($$0);
   }

   @Override
   protected boolean a(dud $$0, aru $$1, gu $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public dug<?> b() {
      return dug.a;
   }
}

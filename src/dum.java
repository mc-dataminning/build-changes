import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dum extends duh {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bgl.b(duh.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, dum::new)
   );
   private final bgl<duh> b;

   public dum(bgl<duh> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ate $$0, dmh $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public dui<?> a() {
      return dui.f;
   }
}

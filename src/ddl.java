import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ddl extends cur {
   public static final MapCodec<ddl> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(ddl::b), t()).apply($$0, ddl::new));
   private final cix d;

   @Override
   public MapCodec<ddl> a() {
      return c;
   }

   protected ddl(cix $$0, dga.d $$1) {
      super($$1);
      this.d = $$0;
   }

   public cix b() {
      return this.d;
   }
}

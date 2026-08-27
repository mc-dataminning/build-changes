import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class deb extends daj implements cwa {
   public static final MapCodec<deb> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(clf.q.fieldOf("color").forGetter(deb::b), u()).apply($$0, deb::new));
   private final clf k;

   @Override
   public MapCodec<deb> a() {
      return j;
   }

   public deb(clf $$0, diz.d $$1) {
      super($$1);
      this.k = $$0;
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public clf b() {
      return this.k;
   }
}

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbr extends cxz implements ctr {
   public static final MapCodec<dbr> j = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cix.q.fieldOf("color").forGetter(dbr::b), t()).apply($$0, dbr::new));
   private final cix k;

   @Override
   public MapCodec<dbr> a() {
      return j;
   }

   public dbr(cix $$0, dga.d $$1) {
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
   public cix b() {
      return this.k;
   }
}

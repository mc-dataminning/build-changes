import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eaa extends dzy {
   public static final Codec<eaa> b = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  Codec.floatRange(-1.0F, 1.0F).fieldOf("threshold").forGetter($$0x -> $$0x.g),
                  Codec.floatRange(0.0F, 1.0F).fieldOf("high_chance").forGetter($$0x -> $$0x.h),
                  dmz.b.fieldOf("default_state").forGetter($$0x -> $$0x.i),
                  Codec.list(dmz.b).fieldOf("low_states").forGetter($$0x -> $$0x.j),
                  Codec.list(dmz.b).fieldOf("high_states").forGetter($$0x -> $$0x.k)
               )
            )
            .apply($$0, eaa::new)
   );
   private final float g;
   private final float h;
   private final dmz i;
   private final List<dmz> j;
   private final List<dmz> k;

   public eaa(long $$0, ehq.a $$1, float $$2, float $$3, float $$4, dmz $$5, List<dmz> $$6, List<dmz> $$7) {
      super($$0, $$1, $$2);
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
   }

   @Override
   protected dzw<?> a() {
      return dzw.c;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      double $$2 = this.a($$1, (double)this.e);
      if ($$2 < (double)this.g) {
         return ac.a(this.j, $$0);
      } else {
         return $$0.i() < this.h ? ac.a(this.k, $$0) : this.i;
      }
   }
}

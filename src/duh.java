import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duh implements dtr {
   public static final Codec<duh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dyd.b.fieldOf("feature").forGetter($$0x -> $$0x.b),
               Codec.intRange(1, 64).fieldOf("required_vertical_space_for_tree").forGetter($$0x -> $$0x.c),
               Codec.intRange(1, 64).fieldOf("root_radius").forGetter($$0x -> $$0x.d),
               asq.b(ke.f).fieldOf("root_replaceable").forGetter($$0x -> $$0x.e),
               dvs.a.fieldOf("root_state_provider").forGetter($$0x -> $$0x.f),
               Codec.intRange(1, 256).fieldOf("root_placement_attempts").forGetter($$0x -> $$0x.g),
               Codec.intRange(1, 4096).fieldOf("root_column_max_height").forGetter($$0x -> $$0x.h),
               Codec.intRange(1, 64).fieldOf("hanging_root_radius").forGetter($$0x -> $$0x.i),
               Codec.intRange(0, 16).fieldOf("hanging_roots_vertical_span").forGetter($$0x -> $$0x.j),
               dvs.a.fieldOf("hanging_root_state_provider").forGetter($$0x -> $$0x.k),
               Codec.intRange(1, 256).fieldOf("hanging_root_placement_attempts").forGetter($$0x -> $$0x.l),
               Codec.intRange(1, 64).fieldOf("allowed_vertical_water_for_tree").forGetter($$0x -> $$0x.n),
               dpq.b.fieldOf("allowed_tree_position").forGetter($$0x -> $$0x.o)
            )
            .apply($$0, duh::new)
   );
   public final ih<dyd> b;
   public final int c;
   public final int d;
   public final asq<cwj> e;
   public final dvs f;
   public final int g;
   public final int h;
   public final int i;
   public final int j;
   public final dvs k;
   public final int l;
   public final int n;
   public final dpq o;

   public duh(ih<dyd> $$0, int $$1, int $$2, asq<cwj> $$3, dvs $$4, int $$5, int $$6, int $$7, int $$8, dvs $$9, int $$10, int $$11, dpq $$12) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
      this.l = $$10;
      this.n = $$11;
      this.o = $$12;
   }
}

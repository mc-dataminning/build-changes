import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class emm implements elq {
   public static final Codec<emm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               enr.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               eox.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               enr.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               enc.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eno.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               enr.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               emr.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               eol.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, emm::new)
   );
   public final enr b;
   public final enr c;
   public final eox d;
   public final enr e;
   public final enc f;
   public final Optional<eno> g;
   public final emr h;
   public final List<eol> i;
   public final boolean j;
   public final boolean k;

   protected emm(enr $$0, eox $$1, enr $$2, enc $$3, Optional<eno> $$4, enr $$5, emr $$6, List<eol> $$7, boolean $$8, boolean $$9) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.c = $$5;
      this.h = $$6;
      this.i = $$7;
      this.j = $$8;
      this.k = $$9;
   }

   public static class a {
      public final enr a;
      private final eox c;
      public final enr b;
      private final enc d;
      private final Optional<eno> e;
      private enr f;
      private final emr g;
      private List<eol> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(enr $$0, eox $$1, enr $$2, enc $$3, Optional<eno> $$4, emr $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = enr.a(dmh.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(enr $$0, eox $$1, enr $$2, enc $$3, emr $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public emm.a a(enr $$0) {
         this.f = $$0;
         return this;
      }

      public emm.a a(List<eol> $$0) {
         this.h = $$0;
         return this;
      }

      public emm.a a() {
         this.i = true;
         return this;
      }

      public emm.a b() {
         this.j = true;
         return this;
      }

      public emm c() {
         return new emm(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}

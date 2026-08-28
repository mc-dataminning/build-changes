import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ekr implements ejv {
   public static final Codec<ekr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elw.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               enc.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               elw.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               elh.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               elt.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               elw.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ekw.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               emq.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ekr::new)
   );
   public final elw b;
   public final elw c;
   public final enc d;
   public final elw e;
   public final elh f;
   public final Optional<elt> g;
   public final ekw h;
   public final List<emq> i;
   public final boolean j;
   public final boolean k;

   protected ekr(elw $$0, enc $$1, elw $$2, elh $$3, Optional<elt> $$4, elw $$5, ekw $$6, List<emq> $$7, boolean $$8, boolean $$9) {
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
      public final elw a;
      private final enc c;
      public final elw b;
      private final elh d;
      private final Optional<elt> e;
      private elw f;
      private final ekw g;
      private List<emq> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(elw $$0, enc $$1, elw $$2, elh $$3, Optional<elt> $$4, ekw $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = elw.a(dkw.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(elw $$0, enc $$1, elw $$2, elh $$3, ekw $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ekr.a a(elw $$0) {
         this.f = $$0;
         return this;
      }

      public ekr.a a(List<emq> $$0) {
         this.h = $$0;
         return this;
      }

      public ekr.a a() {
         this.i = true;
         return this;
      }

      public ekr.a b() {
         this.j = true;
         return this;
      }

      public ekr c() {
         return new ekr(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}

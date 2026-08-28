import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class ejw implements eja {
   public static final Codec<ejw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elb.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
               emg.c.fieldOf("trunk_placer").forGetter($$0x -> $$0x.d),
               elb.a.fieldOf("foliage_provider").forGetter($$0x -> $$0x.e),
               ekm.d.fieldOf("foliage_placer").forGetter($$0x -> $$0x.f),
               eky.d.optionalFieldOf("root_placer").forGetter($$0x -> $$0x.g),
               elb.a.fieldOf("dirt_provider").forGetter($$0x -> $$0x.c),
               ekb.a.fieldOf("minimum_size").forGetter($$0x -> $$0x.h),
               elu.h.listOf().fieldOf("decorators").forGetter($$0x -> $$0x.i),
               Codec.BOOL.fieldOf("ignore_vines").orElse(false).forGetter($$0x -> $$0x.j),
               Codec.BOOL.fieldOf("force_dirt").orElse(false).forGetter($$0x -> $$0x.k)
            )
            .apply($$0, ejw::new)
   );
   public final elb b;
   public final elb c;
   public final emg d;
   public final elb e;
   public final ekm f;
   public final Optional<eky> g;
   public final ekb h;
   public final List<elu> i;
   public final boolean j;
   public final boolean k;

   protected ejw(elb $$0, emg $$1, elb $$2, ekm $$3, Optional<eky> $$4, elb $$5, ekb $$6, List<elu> $$7, boolean $$8, boolean $$9) {
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
      public final elb a;
      private final emg c;
      public final elb b;
      private final ekm d;
      private final Optional<eky> e;
      private elb f;
      private final ekb g;
      private List<elu> h = ImmutableList.of();
      private boolean i;
      private boolean j;

      public a(elb $$0, emg $$1, elb $$2, ekm $$3, Optional<eky> $$4, ekb $$5) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$2;
         this.f = elb.a(dko.j);
         this.d = $$3;
         this.e = $$4;
         this.g = $$5;
      }

      public a(elb $$0, emg $$1, elb $$2, ekm $$3, ekb $$4) {
         this($$0, $$1, $$2, $$3, Optional.empty(), $$4);
      }

      public ejw.a a(elb $$0) {
         this.f = $$0;
         return this;
      }

      public ejw.a a(List<elu> $$0) {
         this.h = $$0;
         return this;
      }

      public ejw.a a() {
         this.i = true;
         return this;
      }

      public ejw.a b() {
         this.j = true;
         return this;
      }

      public ejw c() {
         return new ejw(this.a, this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
      }
   }
}

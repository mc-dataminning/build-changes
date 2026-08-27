import com.google.common.collect.ImmutableSet;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ekk extends eko {
   public static final Codec<ekk> a = RecordCodecBuilder.create($$0 -> a($$0).and(ejc.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, ekk::new));
   private final ejc.b b;

   public ekk(List<emb> $$0, ejc.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ekq b() {
      return ekr.v;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(this.b.a());
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      if ($$0.a(cpg.uj) && $$1.c(this.b.a()) instanceof chl $$2) {
         GameProfile $$3 = $$2.fS();
         $$0.x().a("SkullOwner", tl.a(new sw(), $$3));
      }

      return $$0;
   }

   public static eko.a<?> a(ejc.b $$0) {
      return a($$1 -> new ekk($$1, $$0));
   }
}

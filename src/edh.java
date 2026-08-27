import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edh extends edn {
   public static final Codec<edh> a = RecordCodecBuilder.create($$0 -> $$0.group(ebk.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, edh::new));
   private final il<ebk> b;
   private final sy c;

   protected edh(il<ebk> $$0, edp.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private sy b() {
      sy $$0 = new sy();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dkl.a.a.c());
      return $$0;
   }

   @Override
   public jf a(egh $$0, dfr $$1) {
      return jf.g;
   }

   @Override
   public List<egg.c> a(egh $$0, ib $$1, dfr $$2, awt $$3) {
      List<egg.c> $$4 = Lists.newArrayList();
      $$4.add(new egg.c($$1, czh.pb.o().a(ddg.b, ij.a(ih.a, ih.d)), this.c));
      return $$4;
   }

   @Override
   public eby a(egh $$0, ib $$1, dfr $$2) {
      jf $$3 = this.a($$0, $$2);
      return new eby($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(egh $$0, cwz $$1, cwx $$2, dob $$3, ib $$4, ib $$5, dfr $$6, eby $$7, awt $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public edo<?> a() {
      return edo.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}

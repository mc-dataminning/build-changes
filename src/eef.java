import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eef extends eel {
   public static final Codec<eef> a = RecordCodecBuilder.create($$0 -> $$0.group(eci.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, eef::new));
   private final il<eci> b;
   private final ta c;

   protected eef(il<eci> $$0, een.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private ta b() {
      ta $$0 = new ta();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dli.a.a.c());
      return $$0;
   }

   @Override
   public jg a(ehf $$0, dgo $$1) {
      return jg.g;
   }

   @Override
   public List<ehe.c> a(ehf $$0, ib $$1, dgo $$2, axd $$3) {
      List<ehe.c> $$4 = Lists.newArrayList();
      $$4.add(new ehe.c($$1, dae.pb.o().a(ded.b, ij.a(ih.a, ih.d)), this.c));
      return $$4;
   }

   @Override
   public ecw a(ehf $$0, ib $$1, dgo $$2) {
      jg $$3 = this.a($$0, $$2);
      return new ecw($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ehf $$0, cxw $$1, cxu $$2, doy $$3, ib $$4, ib $$5, dgo $$6, ecw $$7, axd $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public eem<?> a() {
      return eem.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class dyi extends dyo {
   public static final Codec<dyi> a = RecordCodecBuilder.create($$0 -> $$0.group(dwl.b.fieldOf("feature").forGetter($$0x -> $$0x.b), d()).apply($$0, dyi::new));
   private final ib<dwl> b;
   private final rz c;

   protected dyi(ib<dwl> $$0, dyq.a $$1) {
      super($$1);
      this.b = $$0;
      this.c = this.b();
   }

   private rz b() {
      rz $$0 = new rz();
      $$0.a("name", "minecraft:bottom");
      $$0.a("final_state", "minecraft:air");
      $$0.a("pool", "minecraft:empty");
      $$0.a("target", "minecraft:empty");
      $$0.a("joint", dgd.a.a.c());
      return $$0;
   }

   @Override
   public iw a(ebi $$0, dbm $$1) {
      return iw.g;
   }

   @Override
   public List<ebh.c> a(ebi $$0, ht $$1, dbm $$2, ats $$3) {
      List<ebh.c> $$4 = Lists.newArrayList();
      $$4.add(new ebh.c($$1, cvc.pb.o().a(czb.b, hz.a(hx.a, hx.d)), this.c));
      return $$4;
   }

   @Override
   public dwz a(ebi $$0, ht $$1, dbm $$2) {
      iw $$3 = this.a($$0, $$2);
      return new dwz($$1.u(), $$1.v(), $$1.w(), $$1.u() + $$3.u(), $$1.v() + $$3.v(), $$1.w() + $$3.w());
   }

   @Override
   public boolean a(ebi $$0, csu $$1, css $$2, djf $$3, ht $$4, ht $$5, dbm $$6, dwz $$7, ats $$8, boolean $$9) {
      return this.b.a().a($$1, $$3, $$8, $$4);
   }

   @Override
   public dyp<?> a() {
      return dyp.c;
   }

   @Override
   public String toString() {
      return "Feature[" + this.b + "]";
   }
}

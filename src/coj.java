import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.slf4j.Logger;

public class coj {
   public static final Codec<coj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cok.b.fieldOf("material").forGetter(coj::b), com.b.fieldOf("pattern").forGetter(coj::a)).apply($$0, coj::new)
   );
   private static final Logger c = LogUtils.getLogger();
   public static final String b = "Trim";
   private static final vb d = vb.c(ac.a("item", new agt("smithing_template.upgrade"))).a(n.h);
   private final ie<cok> e;
   private final ie<com> f;
   private final Function<cjs, agt> g;
   private final Function<cjs, agt> h;

   public coj(ie<cok> $$0, ie<com> $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ac.b($$1x -> {
         agt $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_leggings_" + $$3));
      });
      this.h = ac.b($$1x -> {
         agt $$2 = $$1.a().a();
         String $$3 = this.c($$1x);
         return $$2.a((UnaryOperator<String>)($$1xx -> "trims/models/armor/" + $$1xx + "_" + $$3));
      });
   }

   private String c(cjs $$0) {
      Map<cjt, String> $$1 = this.e.a().d();
      return $$0 instanceof cjt && $$1.containsKey($$0) ? $$1.get($$0) : this.e.a().a();
   }

   public boolean a(ie<com> $$0, ie<cok> $$1) {
      return $$0 == this.f && $$1 == this.e;
   }

   public ie<com> a() {
      return this.f;
   }

   public ie<cok> b() {
      return this.e;
   }

   public agt a(cjs $$0) {
      return this.g.apply($$0);
   }

   public agt b(cjs $$0) {
      return this.h.apply($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return !($$0 instanceof coj $$1) ? false : $$1.f == this.f && $$1.e == this.e;
   }

   public static boolean a(is $$0, cmh $$1, coj $$2) {
      if ($$1.a(arz.aH)) {
         $$1.w().a("Trim", (tg)a.encodeStart(agr.a(sx.a, $$0), $$2).result().orElseThrow());
         return true;
      } else {
         return false;
      }
   }

   public static Optional<coj> a(is $$0, cmh $$1, boolean $$2) {
      if ($$1.a(arz.aH) && $$1.v() != null && $$1.v().e("Trim")) {
         sj $$3 = $$1.b("Trim");
         coj $$4 = (coj)a.parse(agr.a(sx.a, $$0), $$3).resultOrPartial($$1x -> {
            if (!$$2) {
               c.warn($$1x);
            }
         }).orElse(null);
         return Optional.ofNullable($$4);
      } else {
         return Optional.empty();
      }
   }

   public static void a(cmh $$0, is $$1, List<vb> $$2) {
      Optional<coj> $$3 = a($$1, $$0, true);
      if ($$3.isPresent()) {
         coj $$4 = $$3.get();
         $$2.add(d);
         $$2.add(va.a().b($$4.a().a().a($$4.b())));
         $$2.add(va.a().b($$4.b().a().e()));
      }
   }
}

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eiu(List<eij> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alb c = new alb("jigsaw");
   private static final Map<alb, alb> d = ImmutableMap.builder()
      .put(new alb("nvi"), c)
      .put(new alb("pcp"), c)
      .put(new alb("bastionremnant"), c)
      .put(new alb("runtime"), c)
      .build();

   public eiu(final List<eij> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(iz $$0) {
      for (eij $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vo a(eiv $$0) {
      ux $$1 = new ux();

      for (eij $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eiu a(ux $$0, eiv $$1) {
      List<eij> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         ur $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alb $$6 = new alb($$5);
         alb $$7 = d.getOrDefault($$6, $$6);
         eiw $$8 = lp.S.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eij $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eiu($$2);
   }

   public ehx b() {
      return eij.a(this.a.stream());
   }

   public List<eij> c() {
      return this.a;
   }
}

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record eld(List<eks> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final alb c = alb.b("jigsaw");
   private static final Map<alb, alb> d = ImmutableMap.builder()
      .put(alb.b("nvi"), c)
      .put(alb.b("pcp"), c)
      .put(alb.b("bastionremnant"), c)
      .put(alb.b("runtime"), c)
      .build();

   public eld(final List<eks> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(je $$0) {
      for (eks $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public vc a(ele $$0) {
      ul $$1 = new ul();

      for (eks $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static eld a(ul $$0, ele $$1) {
      List<eks> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         uf $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         alb $$6 = alb.a($$5);
         alb $$7 = d.getOrDefault($$6, $$6);
         elf $$8 = lu.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eks $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new eld($$2);
   }

   public ekg b() {
      return eks.a(this.a.stream());
   }

   public List<eks> c() {
      return this.a;
   }
}

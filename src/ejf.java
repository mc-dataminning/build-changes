import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ejf(List<eiu> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akk c = new akk("jigsaw");
   private static final Map<akk, akk> d = ImmutableMap.builder()
      .put(new akk("nvi"), c)
      .put(new akk("pcp"), c)
      .put(new akk("bastionremnant"), c)
      .put(new akk("runtime"), c)
      .build();

   public ejf(final List<eiu> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ja $$0) {
      for (eiu $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uu a(ejg $$0) {
      ud $$1 = new ud();

      for (eiu $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ejf a(ud $$0, ejg $$1) {
      List<eiu> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tx $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akk $$6 = new akk($$5);
         akk $$7 = d.getOrDefault($$6, $$6);
         ejh $$8 = lq.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eiu $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ejf($$2);
   }

   public eii b() {
      return eiu.a(this.a.stream());
   }

   public List<eiu> c() {
      return this.a;
   }
}

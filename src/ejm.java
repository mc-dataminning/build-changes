import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ejm(List<ejb> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akk c = new akk("jigsaw");
   private static final Map<akk, akk> d = ImmutableMap.builder()
      .put(new akk("nvi"), c)
      .put(new akk("pcp"), c)
      .put(new akk("bastionremnant"), c)
      .put(new akk("runtime"), c)
      .build();

   public ejm(final List<ejb> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ja $$0) {
      for (ejb $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uu a(ejn $$0) {
      ud $$1 = new ud();

      for (ejb $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ejm a(ud $$0, ejn $$1) {
      List<ejb> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tx $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akk $$6 = new akk($$5);
         akk $$7 = d.getOrDefault($$6, $$6);
         ejo $$8 = lq.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               ejb $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ejm($$2);
   }

   public eip b() {
      return ejb.a(this.a.stream());
   }

   public List<ejb> c() {
      return this.a;
   }
}

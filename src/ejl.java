import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.slf4j.Logger;

public record ejl(List<eja> a) {
   private static final Logger b = LogUtils.getLogger();
   private static final akk c = new akk("jigsaw");
   private static final Map<akk, akk> d = ImmutableMap.builder()
      .put(new akk("nvi"), c)
      .put(new akk("pcp"), c)
      .put(new akk("bastionremnant"), c)
      .put(new akk("runtime"), c)
      .build();

   public ejl(final List<eja> a) {
      this.a = List.copyOf(a);
   }

   public boolean a() {
      return this.a.isEmpty();
   }

   public boolean a(ja $$0) {
      for (eja $$1 : this.a) {
         if ($$1.f().b($$0)) {
            return true;
         }
      }

      return false;
   }

   public uu a(ejm $$0) {
      ud $$1 = new ud();

      for (eja $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public static ejl a(ud $$0, ejm $$1) {
      List<eja> $$2 = Lists.newArrayList();

      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         tx $$4 = $$0.a($$3);
         String $$5 = $$4.l("id").toLowerCase(Locale.ROOT);
         akk $$6 = new akk($$5);
         akk $$7 = d.getOrDefault($$6, $$6);
         ejn $$8 = lq.Q.a($$7);
         if ($$8 == null) {
            b.error("Unknown structure piece id: {}", $$7);
         } else {
            try {
               eja $$9 = $$8.load($$1, $$4);
               $$2.add($$9);
            } catch (Exception var10) {
               b.error("Exception loading structure piece with id {}", $$7, var10);
            }
         }
      }

      return new ejl($$2);
   }

   public eio b() {
      return eja.a(this.a.stream());
   }

   public List<eja> c() {
      return this.a;
   }
}

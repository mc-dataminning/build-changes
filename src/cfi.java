import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class cfi {
   public static final cfe a;
   public static final cfe b;
   public static final cfe c;
   public static final cff d;
   public static final Codec<cfg> e;
   public static final cfg f;
   public static final cfg g;

   public static String a(cfg $$0, cfg $$1) {
      return a(d, $$0, $$1);
   }

   public static String a(cff $$0, cfg $$1, cfg $$2) {
      Set<afw> $$3 = $$0.b($$2);
      Set<afw> $$4 = $$0.b($$1);
      return $$3.stream().filter($$1x -> !$$4.contains($$1x)).map(afw::toString).collect(Collectors.joining(", "));
   }

   public static boolean a(cfg $$0) {
      return !$$0.a(f);
   }

   static {
      cff.a $$0 = new cff.a("main");
      a = $$0.a("vanilla");
      b = $$0.a("bundle");
      c = $$0.a("trade_rebalance");
      d = $$0.a();
      e = d.b();
      f = cfg.a(a);
      g = f;
   }
}

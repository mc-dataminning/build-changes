import com.google.common.collect.ImmutableMap;

public class fam {
   public static final fau a = new fau(0, fau.a.a, fau.b.a, 3);
   public static final fau b = new fau(0, fau.a.b, fau.b.c, 4);
   public static final fau c = new fau(0, fau.a.a, fau.b.d, 2);
   public static final fau d = new fau(1, fau.a.e, fau.b.d, 2);
   public static final fau e = new fau(2, fau.a.e, fau.b.d, 2);
   public static final fau f = new fau(0, fau.a.c, fau.b.b, 3);
   public static final fau g = new fau(0, fau.a.c, fau.b.e, 1);
   public static final fau h = c;
   public static final fat i = new fat(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final fat j = new fat(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final fat k = new fat(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final fat l = new fat(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final fat m = new fat(ImmutableMap.builder().put("Position", a).build());
   public static final fat n = new fat(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final fat o = new fat(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final fat p = new fat(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final fat q = new fat(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final fat r = new fat(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final fat s = new fat(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final fat t = new fat(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final fat u = new fat(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final fat v = new fat(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}

import com.google.common.collect.ImmutableMap;

public class elf {
   public static final eln a = new eln(0, eln.a.a, eln.b.a, 3);
   public static final eln b = new eln(0, eln.a.b, eln.b.c, 4);
   public static final eln c = new eln(0, eln.a.a, eln.b.d, 2);
   public static final eln d = new eln(1, eln.a.e, eln.b.d, 2);
   public static final eln e = new eln(2, eln.a.e, eln.b.d, 2);
   public static final eln f = new eln(0, eln.a.c, eln.b.b, 3);
   public static final eln g = new eln(0, eln.a.c, eln.b.e, 1);
   public static final eln h = c;
   public static final elm i = new elm(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final elm j = new elm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final elm k = new elm(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final elm l = new elm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final elm m = new elm(ImmutableMap.builder().put("Position", a).build());
   public static final elm n = new elm(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final elm o = new elm(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final elm p = new elm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final elm q = new elm(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final elm r = new elm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final elm s = new elm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final elm t = new elm(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final elm u = new elm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final elm v = new elm(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}

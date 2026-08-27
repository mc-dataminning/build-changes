import com.google.common.collect.ImmutableMap;

public class epb {
   public static final epj a = new epj(0, epj.a.a, epj.b.a, 3);
   public static final epj b = new epj(0, epj.a.b, epj.b.c, 4);
   public static final epj c = new epj(0, epj.a.a, epj.b.d, 2);
   public static final epj d = new epj(1, epj.a.e, epj.b.d, 2);
   public static final epj e = new epj(2, epj.a.e, epj.b.d, 2);
   public static final epj f = new epj(0, epj.a.c, epj.b.b, 3);
   public static final epj g = new epj(0, epj.a.c, epj.b.e, 1);
   public static final epj h = c;
   public static final epi i = new epi(ImmutableMap.builder().put("Position", a).put("UV", h).put("Color", b).build());
   public static final epi j = new epi(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final epi k = new epi(
      ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV1", d).put("UV2", e).put("Normal", f).put("Padding", g).build()
   );
   public static final epi l = new epi(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("UV2", e).build());
   public static final epi m = new epi(ImmutableMap.builder().put("Position", a).build());
   public static final epi n = new epi(ImmutableMap.builder().put("Position", a).put("Color", b).build());
   public static final epi o = new epi(ImmutableMap.builder().put("Position", a).put("Color", b).put("Normal", f).put("Padding", g).build());
   public static final epi p = new epi(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV2", e).build());
   public static final epi q = new epi(ImmutableMap.builder().put("Position", a).put("UV0", c).build());
   public static final epi r = new epi(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).build());
   public static final epi s = new epi(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).build());
   public static final epi t = new epi(ImmutableMap.builder().put("Position", a).put("Color", b).put("UV0", c).put("UV2", e).build());
   public static final epi u = new epi(ImmutableMap.builder().put("Position", a).put("UV0", c).put("UV2", e).put("Color", b).build());
   public static final epi v = new epi(ImmutableMap.builder().put("Position", a).put("UV0", c).put("Color", b).put("Normal", f).put("Padding", g).build());
}
